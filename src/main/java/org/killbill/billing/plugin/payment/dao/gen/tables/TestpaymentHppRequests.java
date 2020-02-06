/*
 * Copyright 2014-2020 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/*
 * This file is generated by jOOQ.
*/
package org.killbill.billing.plugin.payment.dao.gen.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;
import org.killbill.billing.plugin.payment.dao.gen.Keys;
import org.killbill.billing.plugin.payment.dao.gen.Killbill;
import org.killbill.billing.plugin.payment.dao.gen.tables.records.TestpaymentHppRequestsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestpaymentHppRequests extends TableImpl<TestpaymentHppRequestsRecord> {

    private static final long serialVersionUID = 1613575997;

    /**
     * The reference instance of <code>killbill.testpayment_hpp_requests</code>
     */
    public static final TestpaymentHppRequests TESTPAYMENT_HPP_REQUESTS = new TestpaymentHppRequests();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestpaymentHppRequestsRecord> getRecordType() {
        return TestpaymentHppRequestsRecord.class;
    }

    /**
     * The column <code>killbill.testpayment_hpp_requests.record_id</code>.
     */
    public final TableField<TestpaymentHppRequestsRecord, ULong> RECORD_ID = createField("record_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>killbill.testpayment_hpp_requests.kb_account_id</code>.
     */
    public final TableField<TestpaymentHppRequestsRecord, String> KB_ACCOUNT_ID = createField("kb_account_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * The column <code>killbill.testpayment_hpp_requests.kb_payment_id</code>.
     */
    public final TableField<TestpaymentHppRequestsRecord, String> KB_PAYMENT_ID = createField("kb_payment_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>killbill.testpayment_hpp_requests.kb_payment_transaction_id</code>.
     */
    public final TableField<TestpaymentHppRequestsRecord, String> KB_PAYMENT_TRANSACTION_ID = createField("kb_payment_transaction_id", org.jooq.impl.SQLDataType.CHAR.length(36), this, "");

    /**
     * The column <code>killbill.testpayment_hpp_requests.session_id</code>.
     */
    public final TableField<TestpaymentHppRequestsRecord, String> SESSION_ID = createField("session_id", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>killbill.testpayment_hpp_requests.additional_data</code>.
     */
    public final TableField<TestpaymentHppRequestsRecord, String> ADDITIONAL_DATA = createField("additional_data", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>killbill.testpayment_hpp_requests.created_date</code>.
     */
    public final TableField<TestpaymentHppRequestsRecord, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>killbill.testpayment_hpp_requests.kb_tenant_id</code>.
     */
    public final TableField<TestpaymentHppRequestsRecord, String> KB_TENANT_ID = createField("kb_tenant_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

    /**
     * Create a <code>killbill.testpayment_hpp_requests</code> table reference
     */
    public TestpaymentHppRequests() {
        this("testpayment_hpp_requests", null);
    }

    /**
     * Create an aliased <code>killbill.testpayment_hpp_requests</code> table reference
     */
    public TestpaymentHppRequests(String alias) {
        this(alias, TESTPAYMENT_HPP_REQUESTS);
    }

    private TestpaymentHppRequests(String alias, Table<TestpaymentHppRequestsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TestpaymentHppRequests(String alias, Table<TestpaymentHppRequestsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Killbill.KILLBILL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TestpaymentHppRequestsRecord, ULong> getIdentity() {
        return Keys.IDENTITY_TESTPAYMENT_HPP_REQUESTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TestpaymentHppRequestsRecord> getPrimaryKey() {
        return Keys.KEY_TESTPAYMENT_HPP_REQUESTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TestpaymentHppRequestsRecord>> getKeys() {
        return Arrays.<UniqueKey<TestpaymentHppRequestsRecord>>asList(Keys.KEY_TESTPAYMENT_HPP_REQUESTS_PRIMARY, Keys.KEY_TESTPAYMENT_HPP_REQUESTS_RECORD_ID, Keys.KEY_TESTPAYMENT_HPP_REQUESTS_TESTPAYMENT_HPP_REQUESTS_KB_SESSION_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentHppRequests as(String alias) {
        return new TestpaymentHppRequests(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TestpaymentHppRequests rename(String name) {
        return new TestpaymentHppRequests(name, null);
    }
}
