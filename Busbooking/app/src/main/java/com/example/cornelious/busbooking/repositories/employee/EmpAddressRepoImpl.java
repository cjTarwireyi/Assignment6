package com.example.cornelious.busbooking.repositories.employee;



import com.example.cornelious.busbooking.Interfaces.IEmployeeAddressRepository;

import com.example.cornelious.busbooking.domain.employee.EmpAddressVO;

import java.util.HashMap;

/**
 * Created by Cornelious on 4/17/2016.
 */
public class EmpAddressRepoImpl implements IEmployeeAddressRepository {
    private EmpAddressVO objSearchValues;

    HashMap<String,EmpAddressVO> empAdsressMap = new HashMap<String, EmpAddressVO>();

    @Override
    public EmpAddressVO addAddress(String key,EmpAddressVO objAddress) {
        empAdsressMap.put("1",objAddress);
        return objAddress;
    }


    @Override
    public EmpAddressVO findAddress(String key) {
        objSearchValues=empAdsressMap.get(key);
        if (objSearchValues!=null)
        {
            EmpAddressVO objEmployeeAddress= new EmpAddressVO.AddressBuilder()
                    .street(objSearchValues.getStreet())
                    .city(objSearchValues.getCity())
                    .code(objSearchValues.getCode())
                    .build();
            return objEmployeeAddress;
        }
        return null;
    }

    @Override
    public EmpAddressVO remove(String key) {
        empAdsressMap.remove(key);
        return null;
    }
}
