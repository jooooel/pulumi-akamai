// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.CloudwrapperConfigurationLocationCapacityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CloudwrapperConfigurationLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudwrapperConfigurationLocationArgs Empty = new CloudwrapperConfigurationLocationArgs();

    @Import(name="capacity")
    private @Nullable Output<CloudwrapperConfigurationLocationCapacityArgs> capacity;

    public Optional<Output<CloudwrapperConfigurationLocationCapacityArgs>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    @Import(name="comments", required=true)
    private Output<String> comments;

    public Output<String> comments() {
        return this.comments;
    }

    @Import(name="trafficTypeId", required=true)
    private Output<Integer> trafficTypeId;

    public Output<Integer> trafficTypeId() {
        return this.trafficTypeId;
    }

    private CloudwrapperConfigurationLocationArgs() {}

    private CloudwrapperConfigurationLocationArgs(CloudwrapperConfigurationLocationArgs $) {
        this.capacity = $.capacity;
        this.comments = $.comments;
        this.trafficTypeId = $.trafficTypeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudwrapperConfigurationLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudwrapperConfigurationLocationArgs $;

        public Builder() {
            $ = new CloudwrapperConfigurationLocationArgs();
        }

        public Builder(CloudwrapperConfigurationLocationArgs defaults) {
            $ = new CloudwrapperConfigurationLocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacity(@Nullable Output<CloudwrapperConfigurationLocationCapacityArgs> capacity) {
            $.capacity = capacity;
            return this;
        }

        public Builder capacity(CloudwrapperConfigurationLocationCapacityArgs capacity) {
            return capacity(Output.of(capacity));
        }

        public Builder comments(Output<String> comments) {
            $.comments = comments;
            return this;
        }

        public Builder comments(String comments) {
            return comments(Output.of(comments));
        }

        public Builder trafficTypeId(Output<Integer> trafficTypeId) {
            $.trafficTypeId = trafficTypeId;
            return this;
        }

        public Builder trafficTypeId(Integer trafficTypeId) {
            return trafficTypeId(Output.of(trafficTypeId));
        }

        public CloudwrapperConfigurationLocationArgs build() {
            $.comments = Objects.requireNonNull($.comments, "expected parameter 'comments' to be non-null");
            $.trafficTypeId = Objects.requireNonNull($.trafficTypeId, "expected parameter 'trafficTypeId' to be non-null");
            return $;
        }
    }

}