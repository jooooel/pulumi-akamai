// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.trafficmanagement.inputs;

import com.pulumi.akamai.trafficmanagement.inputs.GtmCidrmapAssignmentArgs;
import com.pulumi.akamai.trafficmanagement.inputs.GtmCidrmapDefaultDatacenterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GtmCidrmapState extends com.pulumi.resources.ResourceArgs {

    public static final GtmCidrmapState Empty = new GtmCidrmapState();

    /**
     * Contains information about the CIDR zone groupings of CIDR blocks. You can have multiple entries with this argument. If used, requires these additional arguments:
     * 
     */
    @Import(name="assignments")
    private @Nullable Output<List<GtmCidrmapAssignmentArgs>> assignments;

    /**
     * @return Contains information about the CIDR zone groupings of CIDR blocks. You can have multiple entries with this argument. If used, requires these additional arguments:
     * 
     */
    public Optional<Output<List<GtmCidrmapAssignmentArgs>>> assignments() {
        return Optional.ofNullable(this.assignments);
    }

    /**
     * A placeholder for all other CIDR zones not found in these CIDR zones. Requires these additional arguments:
     * 
     */
    @Import(name="defaultDatacenter")
    private @Nullable Output<GtmCidrmapDefaultDatacenterArgs> defaultDatacenter;

    /**
     * @return A placeholder for all other CIDR zones not found in these CIDR zones. Requires these additional arguments:
     * 
     */
    public Optional<Output<GtmCidrmapDefaultDatacenterArgs>> defaultDatacenter() {
        return Optional.ofNullable(this.defaultDatacenter);
    }

    /**
     * GTM Domain name for the CIDR Map.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return GTM Domain name for the CIDR Map.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * A descriptive label for the CIDR map, up to 255 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A descriptive label for the CIDR map, up to 255 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A boolean that, if set to `true`, waits for transaction to complete.
     * 
     */
    @Import(name="waitOnComplete")
    private @Nullable Output<Boolean> waitOnComplete;

    /**
     * @return A boolean that, if set to `true`, waits for transaction to complete.
     * 
     */
    public Optional<Output<Boolean>> waitOnComplete() {
        return Optional.ofNullable(this.waitOnComplete);
    }

    private GtmCidrmapState() {}

    private GtmCidrmapState(GtmCidrmapState $) {
        this.assignments = $.assignments;
        this.defaultDatacenter = $.defaultDatacenter;
        this.domain = $.domain;
        this.name = $.name;
        this.waitOnComplete = $.waitOnComplete;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GtmCidrmapState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GtmCidrmapState $;

        public Builder() {
            $ = new GtmCidrmapState();
        }

        public Builder(GtmCidrmapState defaults) {
            $ = new GtmCidrmapState(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignments Contains information about the CIDR zone groupings of CIDR blocks. You can have multiple entries with this argument. If used, requires these additional arguments:
         * 
         * @return builder
         * 
         */
        public Builder assignments(@Nullable Output<List<GtmCidrmapAssignmentArgs>> assignments) {
            $.assignments = assignments;
            return this;
        }

        /**
         * @param assignments Contains information about the CIDR zone groupings of CIDR blocks. You can have multiple entries with this argument. If used, requires these additional arguments:
         * 
         * @return builder
         * 
         */
        public Builder assignments(List<GtmCidrmapAssignmentArgs> assignments) {
            return assignments(Output.of(assignments));
        }

        /**
         * @param assignments Contains information about the CIDR zone groupings of CIDR blocks. You can have multiple entries with this argument. If used, requires these additional arguments:
         * 
         * @return builder
         * 
         */
        public Builder assignments(GtmCidrmapAssignmentArgs... assignments) {
            return assignments(List.of(assignments));
        }

        /**
         * @param defaultDatacenter A placeholder for all other CIDR zones not found in these CIDR zones. Requires these additional arguments:
         * 
         * @return builder
         * 
         */
        public Builder defaultDatacenter(@Nullable Output<GtmCidrmapDefaultDatacenterArgs> defaultDatacenter) {
            $.defaultDatacenter = defaultDatacenter;
            return this;
        }

        /**
         * @param defaultDatacenter A placeholder for all other CIDR zones not found in these CIDR zones. Requires these additional arguments:
         * 
         * @return builder
         * 
         */
        public Builder defaultDatacenter(GtmCidrmapDefaultDatacenterArgs defaultDatacenter) {
            return defaultDatacenter(Output.of(defaultDatacenter));
        }

        /**
         * @param domain GTM Domain name for the CIDR Map.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain GTM Domain name for the CIDR Map.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param name A descriptive label for the CIDR map, up to 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A descriptive label for the CIDR map, up to 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param waitOnComplete A boolean that, if set to `true`, waits for transaction to complete.
         * 
         * @return builder
         * 
         */
        public Builder waitOnComplete(@Nullable Output<Boolean> waitOnComplete) {
            $.waitOnComplete = waitOnComplete;
            return this;
        }

        /**
         * @param waitOnComplete A boolean that, if set to `true`, waits for transaction to complete.
         * 
         * @return builder
         * 
         */
        public Builder waitOnComplete(Boolean waitOnComplete) {
            return waitOnComplete(Output.of(waitOnComplete));
        }

        public GtmCidrmapState build() {
            return $;
        }
    }

}