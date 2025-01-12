// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorTieredDistributionAdvancedArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorTieredDistributionAdvancedArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorTieredDistributionAdvancedArgs();

    @Import(name="allowall")
    private @Nullable Output<Boolean> allowall;

    public Optional<Output<Boolean>> allowall() {
        return Optional.ofNullable(this.allowall);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="method")
    private @Nullable Output<String> method;

    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    @Import(name="policy")
    private @Nullable Output<String> policy;

    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="tieredDistributionMap")
    private @Nullable Output<String> tieredDistributionMap;

    public Optional<Output<String>> tieredDistributionMap() {
        return Optional.ofNullable(this.tieredDistributionMap);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorTieredDistributionAdvancedArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorTieredDistributionAdvancedArgs(GetPropertyRulesBuilderRulesV20230530BehaviorTieredDistributionAdvancedArgs $) {
        this.allowall = $.allowall;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.method = $.method;
        this.policy = $.policy;
        this.templateUuid = $.templateUuid;
        this.tieredDistributionMap = $.tieredDistributionMap;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorTieredDistributionAdvancedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorTieredDistributionAdvancedArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorTieredDistributionAdvancedArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorTieredDistributionAdvancedArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorTieredDistributionAdvancedArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowall(@Nullable Output<Boolean> allowall) {
            $.allowall = allowall;
            return this;
        }

        public Builder allowall(Boolean allowall) {
            return allowall(Output.of(allowall));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        public Builder method(String method) {
            return method(Output.of(method));
        }

        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder tieredDistributionMap(@Nullable Output<String> tieredDistributionMap) {
            $.tieredDistributionMap = tieredDistributionMap;
            return this;
        }

        public Builder tieredDistributionMap(String tieredDistributionMap) {
            return tieredDistributionMap(Output.of(tieredDistributionMap));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorTieredDistributionAdvancedArgs build() {
            return $;
        }
    }

}
