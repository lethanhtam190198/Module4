package ex.mailbox.service;

import ex.mailbox.model.Mail;

import java.util.List;

public interface IMailService {
    List<Mail> findAll();

    String[] lang();

    Integer[] size();

    void save(int id,Mail mail);

}
