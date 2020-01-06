package com.business.service.domain;

import java.io.Serializable;

/**
 * A Loanpool.
 */
public class Loanpool implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String total;

    private String qualified;

    private String rejected;

    private String unreviewed;

    private String totalAmount;

    private String qualifiedAmount;

    private String rejectedAmount;

    private String unreviewedAmount;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTotal() {
        return total;
    }

    public Loanpool total(String total) {
        this.total = total;
        return this;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getQualified() {
        return qualified;
    }

    public Loanpool qualified(String qualified) {
        this.qualified = qualified;
        return this;
    }

    public void setQualified(String qualified) {
        this.qualified = qualified;
    }

    public String getRejected() {
        return rejected;
    }

    public Loanpool rejected(String rejected) {
        this.rejected = rejected;
        return this;
    }

    public void setRejected(String rejected) {
        this.rejected = rejected;
    }

    public String getUnreviewed() {
        return unreviewed;
    }

    public Loanpool unreviewed(String unreviewed) {
        this.unreviewed = unreviewed;
        return this;
    }

    public void setUnreviewed(String unreviewed) {
        this.unreviewed = unreviewed;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public Loanpool totalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getQualifiedAmount() {
        return qualifiedAmount;
    }

    public Loanpool qualifiedAmount(String qualifiedAmount) {
        this.qualifiedAmount = qualifiedAmount;
        return this;
    }

    public void setQualifiedAmount(String qualifiedAmount) {
        this.qualifiedAmount = qualifiedAmount;
    }

    public String getRejectedAmount() {
        return rejectedAmount;
    }

    public Loanpool rejectedAmount(String rejectedAmount) {
        this.rejectedAmount = rejectedAmount;
        return this;
    }

    public void setRejectedAmount(String rejectedAmount) {
        this.rejectedAmount = rejectedAmount;
    }

    public String getUnreviewedAmount() {
        return unreviewedAmount;
    }

    public Loanpool unreviewedAmount(String unreviewedAmount) {
        this.unreviewedAmount = unreviewedAmount;
        return this;
    }

    public void setUnreviewedAmount(String unreviewedAmount) {
        this.unreviewedAmount = unreviewedAmount;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Loanpool)) {
            return false;
        }
        return id != null && id.equals(((Loanpool) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Loanpool{" +
            "id=" + getId() +
            ", total='" + getTotal() + "'" +
            ", qualified='" + getQualified() + "'" +
            ", rejected='" + getRejected() + "'" +
            ", unreviewed='" + getUnreviewed() + "'" +
            ", totalAmount='" + getTotalAmount() + "'" +
            ", qualifiedAmount='" + getQualifiedAmount() + "'" +
            ", rejectedAmount='" + getRejectedAmount() + "'" +
            ", unreviewedAmount='" + getUnreviewedAmount() + "'" +
            "}";
    }
}
