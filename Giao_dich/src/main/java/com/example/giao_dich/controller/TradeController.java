package com.example.giao_dich.controller;


import com.example.giao_dich.dto.TradeDto;
import com.example.giao_dich.model.Trade;
import com.example.giao_dich.service.ICustomerService;
import com.example.giao_dich.service.ITradeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TradeController {

    @Autowired
    private ITradeService tradeService;

    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public String list(Model model) {
        model.addAttribute("tradeList", tradeService.findAll());
        model.addAttribute("customerList",customerService.findAll());
        return "list";
    }

    @GetMapping("/trade/create")
    public String formCreate(Model model) {
        model.addAttribute("tradeList", new Trade());
        model.addAttribute("customerList", customerService.findAll());

        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("tradeList") Trade trade, @Validated TradeDto tradeDto,
                       BindingResult bindingResult,
                       RedirectAttributes redirectAttributes,
                       Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customerList", customerService.findAll());
            return "create";
        }
        else {
            Trade trade1 = new Trade();
            BeanUtils.copyProperties(tradeDto, trade1);

            tradeService.save(trade1);
            redirectAttributes.addFlashAttribute("message", "tao moi thanh cong");
            return "redirect:";
        }
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        tradeService.remove(id);
        return "redirect:";
    }
}
