// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorCloudletPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorArgs();

    @Import(name="cloudletPolicy")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorCloudletPolicyArgs> cloudletPolicy;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorCloudletPolicyArgs>> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }

    @Import(name="cloudletSharedPolicy")
    private @Nullable Output<Integer> cloudletSharedPolicy;

    public Optional<Output<Integer>> cloudletSharedPolicy() {
        return Optional.ofNullable(this.cloudletSharedPolicy);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="isSharedPolicy")
    private @Nullable Output<Boolean> isSharedPolicy;

    public Optional<Output<Boolean>> isSharedPolicy() {
        return Optional.ofNullable(this.isSharedPolicy);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorArgs(GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorArgs $) {
        this.cloudletPolicy = $.cloudletPolicy;
        this.cloudletSharedPolicy = $.cloudletSharedPolicy;
        this.enabled = $.enabled;
        this.isSharedPolicy = $.isSharedPolicy;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudletPolicy(@Nullable Output<GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorCloudletPolicyArgs> cloudletPolicy) {
            $.cloudletPolicy = cloudletPolicy;
            return this;
        }

        public Builder cloudletPolicy(GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorCloudletPolicyArgs cloudletPolicy) {
            return cloudletPolicy(Output.of(cloudletPolicy));
        }

        public Builder cloudletSharedPolicy(@Nullable Output<Integer> cloudletSharedPolicy) {
            $.cloudletSharedPolicy = cloudletSharedPolicy;
            return this;
        }

        public Builder cloudletSharedPolicy(Integer cloudletSharedPolicy) {
            return cloudletSharedPolicy(Output.of(cloudletSharedPolicy));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder isSharedPolicy(@Nullable Output<Boolean> isSharedPolicy) {
            $.isSharedPolicy = isSharedPolicy;
            return this;
        }

        public Builder isSharedPolicy(Boolean isSharedPolicy) {
            return isSharedPolicy(Output.of(isSharedPolicy));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorEdgeRedirectorArgs build() {
            return $;
        }
    }

}