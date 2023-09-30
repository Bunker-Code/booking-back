package com.bunker.bookingback.shared;

import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;

public final class JpaSpecs {

    public static <T> Specification<T> dateGreaterThanOrEqualTo(final String fieldName, final LocalDate date) {
        return (root, query, cb) -> date == null ? null : cb.greaterThanOrEqualTo(root.get(fieldName), date);
    }

    public static <T> Specification<T> dateLessThanOrEqualTo(final String fieldName, final LocalDate date) {
        return (root, query, cb) -> date == null ? null : cb.lessThanOrEqualTo(root.get(fieldName), date);
    }

}
