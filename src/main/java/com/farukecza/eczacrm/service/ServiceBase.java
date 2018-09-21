package com.farukecza.eczacrm.service;

import java.util.Optional;

public interface ServiceBase<T>
{
    Iterable<T> getAll();
    Optional<T> findById(int id);
    T save(T Entity);
    void delete(T Entity);
    void deleteById(int id);
}
