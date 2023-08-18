package com.barbieBank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barbieBank.model.CreditCard;
import com.barbieBank.model.InstallmentItem;

import com.barbieBank.repository.InstallmentItemRepository;

@Service
public class InstallmentItemService {
    private final InstallmentItemRepository installmentItemRepository; // Inject the InstallmentItemRepository

    @Autowired
    public InstallmentItemService(InstallmentItemRepository installmentItemRepository) {
        this.installmentItemRepository = installmentItemRepository;
    }

    public void addInstallment(InstallmentItem installmentItem) {
        installmentItemRepository.save(installmentItem);
    }

    public List<InstallmentItem> getInstallmentItemByCard(Long cardId) {
        return installmentItemRepository.findByCreditCard_cardId(cardId);
    }

}