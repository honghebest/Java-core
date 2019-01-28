package com.hongghe.basicjava.http.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: hongghe @date: 2019-01-28 11:14
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ClientConfig {
    private String ip;
    private String prefix;
    private int port;
}
