// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetCloudwrapperConfigurationLocationCapacityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetCloudwrapperConfigurationLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCloudwrapperConfigurationLocationArgs Empty = new GetCloudwrapperConfigurationLocationArgs();

    @Import(name="capacity", required=true)
    private Output<GetCloudwrapperConfigurationLocationCapacityArgs> capacity;

    public Output<GetCloudwrapperConfigurationLocationCapacityArgs> capacity() {
        return this.capacity;
    }

    @Import(name="comments", required=true)
    private Output<String> comments;

    public Output<String> comments() {
        return this.comments;
    }

    @Import(name="mapName", required=true)
    private Output<String> mapName;

    public Output<String> mapName() {
        return this.mapName;
    }

    @Import(name="trafficTypeId", required=true)
    private Output<Integer> trafficTypeId;

    public Output<Integer> trafficTypeId() {
        return this.trafficTypeId;
    }

    private GetCloudwrapperConfigurationLocationArgs() {}

    private GetCloudwrapperConfigurationLocationArgs(GetCloudwrapperConfigurationLocationArgs $) {
        this.capacity = $.capacity;
        this.comments = $.comments;
        this.mapName = $.mapName;
        this.trafficTypeId = $.trafficTypeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudwrapperConfigurationLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudwrapperConfigurationLocationArgs $;

        public Builder() {
            $ = new GetCloudwrapperConfigurationLocationArgs();
        }

        public Builder(GetCloudwrapperConfigurationLocationArgs defaults) {
            $ = new GetCloudwrapperConfigurationLocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacity(Output<GetCloudwrapperConfigurationLocationCapacityArgs> capacity) {
            $.capacity = capacity;
            return this;
        }

        public Builder capacity(GetCloudwrapperConfigurationLocationCapacityArgs capacity) {
            return capacity(Output.of(capacity));
        }

        public Builder comments(Output<String> comments) {
            $.comments = comments;
            return this;
        }

        public Builder comments(String comments) {
            return comments(Output.of(comments));
        }

        public Builder mapName(Output<String> mapName) {
            $.mapName = mapName;
            return this;
        }

        public Builder mapName(String mapName) {
            return mapName(Output.of(mapName));
        }

        public Builder trafficTypeId(Output<Integer> trafficTypeId) {
            $.trafficTypeId = trafficTypeId;
            return this;
        }

        public Builder trafficTypeId(Integer trafficTypeId) {
            return trafficTypeId(Output.of(trafficTypeId));
        }

        public GetCloudwrapperConfigurationLocationArgs build() {
            $.capacity = Objects.requireNonNull($.capacity, "expected parameter 'capacity' to be non-null");
            $.comments = Objects.requireNonNull($.comments, "expected parameter 'comments' to be non-null");
            $.mapName = Objects.requireNonNull($.mapName, "expected parameter 'mapName' to be non-null");
            $.trafficTypeId = Objects.requireNonNull($.trafficTypeId, "expected parameter 'trafficTypeId' to be non-null");
            return $;
        }
    }

}