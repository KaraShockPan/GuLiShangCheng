package com.atguigu.gmall.bean;

import javax.persistence.Id;
import java.io.Serializable;

public class PmsBaseCatalog3 implements Serializable {

    @Id
    private String Id;
    private String name;
    private String catalog2;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalog2() {
        return catalog2;
    }

    public void setCatalog2(String catalog2) {
        this.catalog2 = catalog2;
    }
}
