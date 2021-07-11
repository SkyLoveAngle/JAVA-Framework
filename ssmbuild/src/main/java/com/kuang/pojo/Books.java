package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
