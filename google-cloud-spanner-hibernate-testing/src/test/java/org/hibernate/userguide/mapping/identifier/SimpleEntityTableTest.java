/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.userguide.mapping.identifier;

import org.hibernate.jpa.test.BaseEntityManagerFunctionalTestCase;
import org.junit.Test;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Vlad Mihalcea
 */
public class SimpleEntityTableTest extends BaseEntityManagerFunctionalTestCase {

    @Override
    protected Class<?>[] getAnnotatedClasses() {
        return new Class<?>[] {
                Book.class
        };
    }

    @Test
    public void test() {

    }

    //tag::entity-pojo-table-mapping-example[]
    @Entity(name = "Book_SimpleEntityTableTest")
    private static class Book {

        @Id
        private Long id;

        private String title;

        private String author;

        //Getters and setters are omitted for brevity
        //end::entity-pojo-table-mapping-example[]

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
        //tag::entity-pojo-table-mapping-example[]
    }
    //end::entity-pojo-table-mapping-example[]
}
