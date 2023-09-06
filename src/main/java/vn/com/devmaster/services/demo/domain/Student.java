package vn.com.devmaster.services.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
//    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String userName;
    private String password;
}
