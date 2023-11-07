package lt.codeacademy.javaua5.lvl2.stream.model;

import java.math.BigDecimal;
import java.util.Comparator;

public record Employee(String name, String surname, BigDecimal salary, int workExperience, String role) {

}
