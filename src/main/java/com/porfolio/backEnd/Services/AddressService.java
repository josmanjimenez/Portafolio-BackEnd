package com.porfolio.backEnd.Services;

import com.porfolio.backEnd.Model.Address;
import com.porfolio.backEnd.Repository.AddressRepository;
import com.porfolio.backEnd.Services.Interface.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService implements IAddressService {
    @Autowired
    public AddressRepository addr;

    @Override
    public List<Address> ShowAddresses() {
        return addr.findAll();
    }

    @Override
    public Optional<Address> ShowAddress(Long id) {
        return addr.findById(id);
    }

    @Override
    public void createAddress(Address add) {
        addr.save(add);
    }

    @Override
    public void deleteAddress(Long id) {
        addr.deleteById(id);
    }

    @Override
    public Optional<Address> findAddress(Long id) {
        return addr.findById(id);
    }
}
