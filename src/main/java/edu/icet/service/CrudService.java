package edu.icet.service;

import edu.icet.dto.SuperDTO;

import java.util.List;

public interface CrudService <T extends SuperDTO,ID>{
    List <T> getAll();
    T search(ID id);
}
