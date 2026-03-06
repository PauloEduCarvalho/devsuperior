package com.devsuperior.CrudClient.servicies.exceptions;

public class ResourcesNotFoundException extends RuntimeException {
    public ResourcesNotFoundException(String msg) {
        super(msg);
    }

}
