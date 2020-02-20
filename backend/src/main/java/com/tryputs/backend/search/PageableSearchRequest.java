package com.tryputs.backend.search;

import lombok.Data;

import java.io.Serializable;

@Data
public class PageableSearchRequest implements Serializable {

    private int offset;
    private int limit = Integer.MAX_VALUE;
}
