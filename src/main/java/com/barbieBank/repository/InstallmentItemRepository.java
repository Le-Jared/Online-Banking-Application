package com.barbieBank.repository;

import org.springframework.stereotype.Repository;

import com.barbieBank.model.CreditCard;
import com.barbieBank.model.InstallmentItem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface InstallmentItemRepository extends JpaRepository<InstallmentItem, Long> {

    List<InstallmentItem> findByCreditCard_cardId(Long cardId);
}
