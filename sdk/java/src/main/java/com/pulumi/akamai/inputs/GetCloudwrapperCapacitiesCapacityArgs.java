// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetCloudwrapperCapacitiesCapacityApprovedArgs;
import com.pulumi.akamai.inputs.GetCloudwrapperCapacitiesCapacityAssignedArgs;
import com.pulumi.akamai.inputs.GetCloudwrapperCapacitiesCapacityUnassignedArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetCloudwrapperCapacitiesCapacityArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCloudwrapperCapacitiesCapacityArgs Empty = new GetCloudwrapperCapacitiesCapacityArgs();

    @Import(name="approved", required=true)
    private Output<GetCloudwrapperCapacitiesCapacityApprovedArgs> approved;

    public Output<GetCloudwrapperCapacitiesCapacityApprovedArgs> approved() {
        return this.approved;
    }

    @Import(name="assigned", required=true)
    private Output<GetCloudwrapperCapacitiesCapacityAssignedArgs> assigned;

    public Output<GetCloudwrapperCapacitiesCapacityAssignedArgs> assigned() {
        return this.assigned;
    }

    @Import(name="contractId", required=true)
    private Output<String> contractId;

    public Output<String> contractId() {
        return this.contractId;
    }

    @Import(name="locationId", required=true)
    private Output<Integer> locationId;

    public Output<Integer> locationId() {
        return this.locationId;
    }

    @Import(name="locationName", required=true)
    private Output<String> locationName;

    public Output<String> locationName() {
        return this.locationName;
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    @Import(name="unassigned", required=true)
    private Output<GetCloudwrapperCapacitiesCapacityUnassignedArgs> unassigned;

    public Output<GetCloudwrapperCapacitiesCapacityUnassignedArgs> unassigned() {
        return this.unassigned;
    }

    private GetCloudwrapperCapacitiesCapacityArgs() {}

    private GetCloudwrapperCapacitiesCapacityArgs(GetCloudwrapperCapacitiesCapacityArgs $) {
        this.approved = $.approved;
        this.assigned = $.assigned;
        this.contractId = $.contractId;
        this.locationId = $.locationId;
        this.locationName = $.locationName;
        this.type = $.type;
        this.unassigned = $.unassigned;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudwrapperCapacitiesCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudwrapperCapacitiesCapacityArgs $;

        public Builder() {
            $ = new GetCloudwrapperCapacitiesCapacityArgs();
        }

        public Builder(GetCloudwrapperCapacitiesCapacityArgs defaults) {
            $ = new GetCloudwrapperCapacitiesCapacityArgs(Objects.requireNonNull(defaults));
        }

        public Builder approved(Output<GetCloudwrapperCapacitiesCapacityApprovedArgs> approved) {
            $.approved = approved;
            return this;
        }

        public Builder approved(GetCloudwrapperCapacitiesCapacityApprovedArgs approved) {
            return approved(Output.of(approved));
        }

        public Builder assigned(Output<GetCloudwrapperCapacitiesCapacityAssignedArgs> assigned) {
            $.assigned = assigned;
            return this;
        }

        public Builder assigned(GetCloudwrapperCapacitiesCapacityAssignedArgs assigned) {
            return assigned(Output.of(assigned));
        }

        public Builder contractId(Output<String> contractId) {
            $.contractId = contractId;
            return this;
        }

        public Builder contractId(String contractId) {
            return contractId(Output.of(contractId));
        }

        public Builder locationId(Output<Integer> locationId) {
            $.locationId = locationId;
            return this;
        }

        public Builder locationId(Integer locationId) {
            return locationId(Output.of(locationId));
        }

        public Builder locationName(Output<String> locationName) {
            $.locationName = locationName;
            return this;
        }

        public Builder locationName(String locationName) {
            return locationName(Output.of(locationName));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder unassigned(Output<GetCloudwrapperCapacitiesCapacityUnassignedArgs> unassigned) {
            $.unassigned = unassigned;
            return this;
        }

        public Builder unassigned(GetCloudwrapperCapacitiesCapacityUnassignedArgs unassigned) {
            return unassigned(Output.of(unassigned));
        }

        public GetCloudwrapperCapacitiesCapacityArgs build() {
            $.approved = Objects.requireNonNull($.approved, "expected parameter 'approved' to be non-null");
            $.assigned = Objects.requireNonNull($.assigned, "expected parameter 'assigned' to be non-null");
            $.contractId = Objects.requireNonNull($.contractId, "expected parameter 'contractId' to be non-null");
            $.locationId = Objects.requireNonNull($.locationId, "expected parameter 'locationId' to be non-null");
            $.locationName = Objects.requireNonNull($.locationName, "expected parameter 'locationName' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.unassigned = Objects.requireNonNull($.unassigned, "expected parameter 'unassigned' to be non-null");
            return $;
        }
    }

}