package com.hongghe.basicjava.json.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author: hongghe @date: 2019-01-22 11:12
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Bird {
    /**
     * The name of bird.
     */
    private @NotNull String name;

    /**
     * The class of bird belong.
     */
    private String clazz;

    /**
     * The normal address.
     */
    private List<String> address;

    /**
     * The parents.
     */
    private List<Bird> parents;
}
