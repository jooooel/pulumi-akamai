// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCpCodeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCpCodeArgs Empty = new GetCpCodeArgs();

    /**
     * Replaced by `contract_id`. Maintained for legacy purposes.
     * 
     * @deprecated
     * The setting &#34;contract&#34; has been deprecated.
     * 
     */
    @Deprecated /* The setting ""contract"" has been deprecated. */
    @Import(name="contract")
    private @Nullable Output<String> contract;

    /**
     * @return Replaced by `contract_id`. Maintained for legacy purposes.
     * 
     * @deprecated
     * The setting &#34;contract&#34; has been deprecated.
     * 
     */
    @Deprecated /* The setting ""contract"" has been deprecated. */
    public Optional<Output<String>> contract() {
        return Optional.ofNullable(this.contract);
    }

    /**
     * (Required) A contract&#39;s unique ID, including the `ctr_` prefix.
     * 
     */
    @Import(name="contractId")
    private @Nullable Output<String> contractId;

    /**
     * @return (Required) A contract&#39;s unique ID, including the `ctr_` prefix.
     * 
     */
    public Optional<Output<String>> contractId() {
        return Optional.ofNullable(this.contractId);
    }

    /**
     * Replaced by `group_id`. Maintained for legacy purposes.
     * 
     * @deprecated
     * The setting &#34;group&#34; has been deprecated.
     * 
     */
    @Deprecated /* The setting ""group"" has been deprecated. */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return Replaced by `group_id`. Maintained for legacy purposes.
     * 
     * @deprecated
     * The setting &#34;group&#34; has been deprecated.
     * 
     */
    @Deprecated /* The setting ""group"" has been deprecated. */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * The group&#39;s unique ID, including the `grp_` prefix.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The group&#39;s unique ID, including the `grp_` prefix.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The name of the CP code.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the CP code.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetCpCodeArgs() {}

    private GetCpCodeArgs(GetCpCodeArgs $) {
        this.contract = $.contract;
        this.contractId = $.contractId;
        this.group = $.group;
        this.groupId = $.groupId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCpCodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCpCodeArgs $;

        public Builder() {
            $ = new GetCpCodeArgs();
        }

        public Builder(GetCpCodeArgs defaults) {
            $ = new GetCpCodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contract Replaced by `contract_id`. Maintained for legacy purposes.
         * 
         * @return builder
         * 
         * @deprecated
         * The setting &#34;contract&#34; has been deprecated.
         * 
         */
        @Deprecated /* The setting ""contract"" has been deprecated. */
        public Builder contract(@Nullable Output<String> contract) {
            $.contract = contract;
            return this;
        }

        /**
         * @param contract Replaced by `contract_id`. Maintained for legacy purposes.
         * 
         * @return builder
         * 
         * @deprecated
         * The setting &#34;contract&#34; has been deprecated.
         * 
         */
        @Deprecated /* The setting ""contract"" has been deprecated. */
        public Builder contract(String contract) {
            return contract(Output.of(contract));
        }

        /**
         * @param contractId (Required) A contract&#39;s unique ID, including the `ctr_` prefix.
         * 
         * @return builder
         * 
         */
        public Builder contractId(@Nullable Output<String> contractId) {
            $.contractId = contractId;
            return this;
        }

        /**
         * @param contractId (Required) A contract&#39;s unique ID, including the `ctr_` prefix.
         * 
         * @return builder
         * 
         */
        public Builder contractId(String contractId) {
            return contractId(Output.of(contractId));
        }

        /**
         * @param group Replaced by `group_id`. Maintained for legacy purposes.
         * 
         * @return builder
         * 
         * @deprecated
         * The setting &#34;group&#34; has been deprecated.
         * 
         */
        @Deprecated /* The setting ""group"" has been deprecated. */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group Replaced by `group_id`. Maintained for legacy purposes.
         * 
         * @return builder
         * 
         * @deprecated
         * The setting &#34;group&#34; has been deprecated.
         * 
         */
        @Deprecated /* The setting ""group"" has been deprecated. */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param groupId The group&#39;s unique ID, including the `grp_` prefix.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The group&#39;s unique ID, including the `grp_` prefix.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param name The name of the CP code.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the CP code.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetCpCodeArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}