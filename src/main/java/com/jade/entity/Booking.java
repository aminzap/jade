package com.jade.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Booking extends BaseEntity {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "property_id")
    private Property property;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;
    @Basic
    @Column(name = "check_in_date")
    private Date checkInDate;
    @Basic
    @Column(name = "check_out_date")
    private Date checkOutDate;
    @Basic
    @Column(name = "price_per_day")
    private BigDecimal pricePerDay;
    @Basic
    @Column(name = "tax_paid")
    private BigDecimal taxPaid;
    @Basic
    @Column(name = "site_fee")
    private BigDecimal siteFee;
    @Basic
    @Column(name = "amount_paid")
    private BigDecimal amountPaid;
    @Basic
    @Column(name = "is_refund")
    private Boolean isRefund;
    @Basic
    @Column(name = "cancel_date")
    private Date cancel_date;
    @Basic
    @Column(name = "refund_paid")
    private BigDecimal refundPaid;
    @Basic
    @Column(name = "refund_date")
    private Date refundDate;
    @Basic
    @Column(name = "booking_date")
    private Date bookingDate;

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public BigDecimal getTaxPaid() {
        return taxPaid;
    }

    public void setTaxPaid(BigDecimal taxPaid) {
        this.taxPaid = taxPaid;
    }

    public BigDecimal getSiteFee() {
        return siteFee;
    }

    public void setSiteFee(BigDecimal siteFee) {
        this.siteFee = siteFee;
    }

    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Boolean getRefund() {
        return isRefund;
    }

    public void setRefund(Boolean refund) {
        isRefund = refund;
    }

    public Date getCancel_date() {
        return cancel_date;
    }

    public void setCancel_date(Date cancel_date) {
        this.cancel_date = cancel_date;
    }

    public BigDecimal getRefundPaid() {
        return refundPaid;
    }

    public void setRefundPaid(BigDecimal refundPaid) {
        this.refundPaid = refundPaid;
    }

    public Date getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(Date refundDate) {
        this.refundDate = refundDate;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
}
