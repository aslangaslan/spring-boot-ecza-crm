package com.farukecza.eczacrm.service;

import com.farukecza.eczacrm.entity.Producer;
import com.farukecza.eczacrm.repository.ProducerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProducerService implements ServiceBase<Producer> {

    @Autowired
    private ProducerRepository producerRepository;

    @Override
    public Iterable<Producer> getAll() {
        return producerRepository.findAll();
    }

    @Override
    public Optional<Producer> findById(int id) {
        return producerRepository.findById(id);
    }

    @Override
    public Producer save(Producer producer) {
        return producerRepository.save(producer);
    }

    @Override
    public void delete(Producer producer) {
        producerRepository.delete(producer);
    }

    @Override
    public void deleteById(int id) {
        producerRepository.deleteById(id);
    }
}
