// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetCloudwrapperLocationsLocationTrafficTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCloudwrapperLocationsLocationTrafficTypeArgs Empty = new GetCloudwrapperLocationsLocationTrafficTypeArgs();

    @Import(name="locationId", required=true)
    private Output<String> locationId;

    public Output<String> locationId() {
        return this.locationId;
    }

    @Import(name="trafficType", required=true)
    private Output<String> trafficType;

    public Output<String> trafficType() {
        return this.trafficType;
    }

    @Import(name="trafficTypeId", required=true)
    private Output<Integer> trafficTypeId;

    public Output<Integer> trafficTypeId() {
        return this.trafficTypeId;
    }

    private GetCloudwrapperLocationsLocationTrafficTypeArgs() {}

    private GetCloudwrapperLocationsLocationTrafficTypeArgs(GetCloudwrapperLocationsLocationTrafficTypeArgs $) {
        this.locationId = $.locationId;
        this.trafficType = $.trafficType;
        this.trafficTypeId = $.trafficTypeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudwrapperLocationsLocationTrafficTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudwrapperLocationsLocationTrafficTypeArgs $;

        public Builder() {
            $ = new GetCloudwrapperLocationsLocationTrafficTypeArgs();
        }

        public Builder(GetCloudwrapperLocationsLocationTrafficTypeArgs defaults) {
            $ = new GetCloudwrapperLocationsLocationTrafficTypeArgs(Objects.requireNonNull(defaults));
        }

        public Builder locationId(Output<String> locationId) {
            $.locationId = locationId;
            return this;
        }

        public Builder locationId(String locationId) {
            return locationId(Output.of(locationId));
        }

        public Builder trafficType(Output<String> trafficType) {
            $.trafficType = trafficType;
            return this;
        }

        public Builder trafficType(String trafficType) {
            return trafficType(Output.of(trafficType));
        }

        public Builder trafficTypeId(Output<Integer> trafficTypeId) {
            $.trafficTypeId = trafficTypeId;
            return this;
        }

        public Builder trafficTypeId(Integer trafficTypeId) {
            return trafficTypeId(Output.of(trafficTypeId));
        }

        public GetCloudwrapperLocationsLocationTrafficTypeArgs build() {
            $.locationId = Objects.requireNonNull($.locationId, "expected parameter 'locationId' to be non-null");
            $.trafficType = Objects.requireNonNull($.trafficType, "expected parameter 'trafficType' to be non-null");
            $.trafficTypeId = Objects.requireNonNull($.trafficTypeId, "expected parameter 'trafficTypeId' to be non-null");
            return $;
        }
    }

}