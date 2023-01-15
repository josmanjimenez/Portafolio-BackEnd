package com.porfolio.backEnd.Services.Interface;

import com.porfolio.backEnd.Model.Address;

import java.util.List;
import java.util.Optional;

public interface IAddressService {
    public List<Address> ShowAddresses ();
    public Optional<Address> ShowAddress(Long id);
    public void createAddress(Address add);
    public void deleteAddress(Long id );
    public Optional<Address> findAddress(Long id );
}
