<%--
  Created by IntelliJ IDEA.
  User: This PC
  Date: 7/18/2022
  Time: 2:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<form:form modelAttribute="mail" action="/save" method="post">
    <table class="table">
        <tr>
            <td>ID</td>
            <td>
                <form:input path="id" />
            </td>
        </tr>

        <td>Language</td>
        <td>
            <form:select path="language" >
                <form:options items="${languageList}"/>
            </form:select>
        </td>
        </tr>
        <tr>
            <td>Page Size</td>
            <td>
                <form:select path="pageSize">
                    <form:options items="${sizeList}"/>value=${sizeList}
                </form:select>
            </td>
        </tr>

        <tr>
            <td>Spams Filter</td>
            <td>
                <form:input path="spamsFilter"/>
            </td>
        </tr>

        <tr>
            <td>Signature</td>
            <td>
                <form:input path="signature"/>
            </td>
        </tr>
    </table>
    <div>
        <button type="submit">Update</button>
    </div>
    <div>
        <button type="reset">Cancel</button>
    </div>
</form:form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

</body>
</html>






























@Controller
public class MailBoxController {
@Autowired
private IMailService mailService;

@GetMapping("")
public String list(Model model) {
model.addAttribute("list", mailService.findAll());
model.addAttribute("languageList", mailService.lang());
model.addAttribute("sizeList", mailService.size());
return "list";
}

@GetMapping("/save")
public String getForm(Model model) {
model.addAttribute("languageList", mailService.lang());
model.addAttribute("sizeList", mailService.size());
model.addAttribute("mail",new Mail());
return "edit";
}

@PostMapping ("/save")
public String save(@ModelAttribute Mail mail) {
mailService.save(mail.getId(),mail);
return "redirect:/";
}
}

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



@Repository
public class MailRepositoryImpl implements IMailRepository {

private static List<Mail> mailList = new ArrayList<>();
String[] language = new  String[]{"english","vietnamese","japanes","chinese"};
Integer[] size = new Integer[]{5,10,15,25,50,100};
static {
mailList.add(new Mail(1,"english", 5, true, "aaaaa"));
mailList.add(new Mail(2,"vietnamese", 15, false, "bbbbb"));

}

@Override
public List<Mail> findAll() {
return mailList;
}

@Override
public String[] language() {
return language;
}

@Override
public Integer[] size() {
return size;
}
}
