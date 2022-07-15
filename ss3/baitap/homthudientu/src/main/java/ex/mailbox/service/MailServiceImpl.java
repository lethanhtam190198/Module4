package ex.mailbox.service;

import ex.mailbox.model.Mail;
import ex.mailbox.repository.IMailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailServiceImpl implements IMailService {
    @Autowired
    private IMailRepository mailRepository;

    @Override
    public List<Mail> findAll() {
        return mailRepository.findAll();
    }

    @Override
    public String[] lang() {
        return mailRepository.language();
    }

    @Override
    public Integer[] size() {
        return mailRepository.size();
    }


    @Override
    public void save(int id,Mail mail) {
        List<Mail> mailList = mailRepository.findAll();
        for (int i = 0; i < mailList.size(); i++) {
            if (id == mailList.get(i).getId()){
                mailList.get(i).setLanguage(mail.getLanguage());
                mailList.get(i).setPageSize(mail.getPageSize());
                mailList.get(i).setSpamsFilter(mail.isSpamsFilter());
                mailList.get(i).setSignature(mail.getSignature());
            }
        }
    }
}
