// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppSecContractsGroupsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecContractsGroupsArgs Empty = new GetAppSecContractsGroupsArgs();

    /**
     * . Unique identifier of an Akamai contract. If not included, information is returned for all the Akamai contracts associated with your account.
     * 
     */
    @Import(name="contractid")
    private @Nullable Output<String> contractid;

    /**
     * @return . Unique identifier of an Akamai contract. If not included, information is returned for all the Akamai contracts associated with your account.
     * 
     */
    public Optional<Output<String>> contractid() {
        return Optional.ofNullable(this.contractid);
    }

    /**
     * . Unique identifier of a contract group. If not included, information is returned for all the groups associated with your account.
     * 
     */
    @Import(name="groupid")
    private @Nullable Output<Integer> groupid;

    /**
     * @return . Unique identifier of a contract group. If not included, information is returned for all the groups associated with your account.
     * 
     */
    public Optional<Output<Integer>> groupid() {
        return Optional.ofNullable(this.groupid);
    }

    private GetAppSecContractsGroupsArgs() {}

    private GetAppSecContractsGroupsArgs(GetAppSecContractsGroupsArgs $) {
        this.contractid = $.contractid;
        this.groupid = $.groupid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecContractsGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecContractsGroupsArgs $;

        public Builder() {
            $ = new GetAppSecContractsGroupsArgs();
        }

        public Builder(GetAppSecContractsGroupsArgs defaults) {
            $ = new GetAppSecContractsGroupsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contractid . Unique identifier of an Akamai contract. If not included, information is returned for all the Akamai contracts associated with your account.
         * 
         * @return builder
         * 
         */
        public Builder contractid(@Nullable Output<String> contractid) {
            $.contractid = contractid;
            return this;
        }

        /**
         * @param contractid . Unique identifier of an Akamai contract. If not included, information is returned for all the Akamai contracts associated with your account.
         * 
         * @return builder
         * 
         */
        public Builder contractid(String contractid) {
            return contractid(Output.of(contractid));
        }

        /**
         * @param groupid . Unique identifier of a contract group. If not included, information is returned for all the groups associated with your account.
         * 
         * @return builder
         * 
         */
        public Builder groupid(@Nullable Output<Integer> groupid) {
            $.groupid = groupid;
            return this;
        }

        /**
         * @param groupid . Unique identifier of a contract group. If not included, information is returned for all the groups associated with your account.
         * 
         * @return builder
         * 
         */
        public Builder groupid(Integer groupid) {
            return groupid(Output.of(groupid));
        }

        public GetAppSecContractsGroupsArgs build() {
            return $;
        }
    }

}