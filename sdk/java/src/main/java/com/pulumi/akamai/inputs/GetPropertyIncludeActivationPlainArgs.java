// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPropertyIncludeActivationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyIncludeActivationPlainArgs Empty = new GetPropertyIncludeActivationPlainArgs();

    /**
     * (Required) A contract&#39;s unique ID, including the optional `ctr_` prefix.
     * 
     */
    @Import(name="contractId", required=true)
    private String contractId;

    /**
     * @return (Required) A contract&#39;s unique ID, including the optional `ctr_` prefix.
     * 
     */
    public String contractId() {
        return this.contractId;
    }

    /**
     * (Required) A group&#39;s unique ID, including the optional `grp_` prefix.
     * 
     */
    @Import(name="groupId", required=true)
    private String groupId;

    /**
     * @return (Required) A group&#39;s unique ID, including the optional `grp_` prefix.
     * 
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * (Required) An include&#39;s unique ID with the optional `inc_` prefix.
     * 
     */
    @Import(name="includeId", required=true)
    private String includeId;

    /**
     * @return (Required) An include&#39;s unique ID with the optional `inc_` prefix.
     * 
     */
    public String includeId() {
        return this.includeId;
    }

    /**
     * (Required) The Akamai network where you want to check the activation details, either `STAGING` or `PRODUCTION`. `STAGING` is the default.
     * 
     */
    @Import(name="network", required=true)
    private String network;

    /**
     * @return (Required) The Akamai network where you want to check the activation details, either `STAGING` or `PRODUCTION`. `STAGING` is the default.
     * 
     */
    public String network() {
        return this.network;
    }

    private GetPropertyIncludeActivationPlainArgs() {}

    private GetPropertyIncludeActivationPlainArgs(GetPropertyIncludeActivationPlainArgs $) {
        this.contractId = $.contractId;
        this.groupId = $.groupId;
        this.includeId = $.includeId;
        this.network = $.network;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyIncludeActivationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyIncludeActivationPlainArgs $;

        public Builder() {
            $ = new GetPropertyIncludeActivationPlainArgs();
        }

        public Builder(GetPropertyIncludeActivationPlainArgs defaults) {
            $ = new GetPropertyIncludeActivationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contractId (Required) A contract&#39;s unique ID, including the optional `ctr_` prefix.
         * 
         * @return builder
         * 
         */
        public Builder contractId(String contractId) {
            $.contractId = contractId;
            return this;
        }

        /**
         * @param groupId (Required) A group&#39;s unique ID, including the optional `grp_` prefix.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param includeId (Required) An include&#39;s unique ID with the optional `inc_` prefix.
         * 
         * @return builder
         * 
         */
        public Builder includeId(String includeId) {
            $.includeId = includeId;
            return this;
        }

        /**
         * @param network (Required) The Akamai network where you want to check the activation details, either `STAGING` or `PRODUCTION`. `STAGING` is the default.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            $.network = network;
            return this;
        }

        public GetPropertyIncludeActivationPlainArgs build() {
            $.contractId = Objects.requireNonNull($.contractId, "expected parameter 'contractId' to be non-null");
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.includeId = Objects.requireNonNull($.includeId, "expected parameter 'includeId' to be non-null");
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            return $;
        }
    }

}