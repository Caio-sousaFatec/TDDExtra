package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
    public List<String> isValidToInclude(Person p) {
        List<String> errors = new ArrayList<>();

        // Verifica se o nome é composto por pelo menos duas partes e contém apenas letras
        if (p.getName() == null || !p.getName().matches("[a-zA-Z]+\\s+[a-zA-Z]+.*")) {
            errors.add("Nome inválido: deve conter pelo menos duas palavras e apenas letras.");
        }

        // Verifica se a idade está no intervalo [1, 200]
        if (p.getAge() < 1 || p.getAge() > 200) {
            errors.add("Idade inválida: deve estar entre 1 e 200.");
        }

        // Verifica se há pelo menos um email
        if (p.getEmails() == null || p.getEmails().isEmpty()) {
            errors.add("Pelo menos um email deve ser informado.");
        } else {
            // Verifica se cada email tem um formato válido
            for (Email email : p.getEmails()) {
                if (!email.getName().matches("^[^@]+@[^@]+\\.[^@]+$") ) {
                    errors.add("Email inválido: " + email.getName());
                }
            }
        }
        return errors;
    }
}