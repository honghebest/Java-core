package com.hongghe.basicjava.http.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: hongghe @date: 2019-01-28 11:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServerConfig {
    private String ip;
    private int port;
}
