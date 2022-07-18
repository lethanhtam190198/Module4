package ex.mailbox.repository;

import ex.mailbox.model.Mail;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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
