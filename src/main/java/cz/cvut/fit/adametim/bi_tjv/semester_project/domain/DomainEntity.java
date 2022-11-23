/*
 * Copyright (c) 2022. Czech Technical University in Prague, Faculty of Information Technology.
 *
 * Project Social Network. Created for Java Technology course.
 *
 *  Authors:
 *  Ondřej Guth (ondrej.guth@fit.cvut.cz)
 *  Jan Blizničenko (jan.bliznicenko@fit.cvut.cz)
 *  Filip Glazar (glazafil@fit.cvut.cz)
 *
 *  This code is intended for educational purposes only.
 *
 */

package cz.cvut.fit.adametim.bi_tjv.semester_project.domain;

import java.io.Serializable;

/**
 * Common supertype for domain types.
 * @param <ID> primary key type
 */
public interface DomainEntity<ID> extends Serializable {
    /**
     * @return the primary key value of this instance
     */
    ID getId();
}
