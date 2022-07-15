package ex.mailbox.repository;

import ex.mailbox.model.Mail;

import java.util.ArrayList;
import java.util.List;

public interface IMailRepository {
    List<Mail> findAll();

    String[] language();

    Integer[] size();

}
