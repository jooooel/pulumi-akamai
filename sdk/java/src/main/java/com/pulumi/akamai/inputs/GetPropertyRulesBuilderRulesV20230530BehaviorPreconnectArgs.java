// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorPreconnectArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorPreconnectArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorPreconnectArgs();

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="preconnectlists")
    private @Nullable Output<List<String>> preconnectlists;

    public Optional<Output<List<String>>> preconnectlists() {
        return Optional.ofNullable(this.preconnectlists);
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

    private GetPropertyRulesBuilderRulesV20230530BehaviorPreconnectArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorPreconnectArgs(GetPropertyRulesBuilderRulesV20230530BehaviorPreconnectArgs $) {
        this.locked = $.locked;
        this.preconnectlists = $.preconnectlists;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorPreconnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorPreconnectArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorPreconnectArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorPreconnectArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorPreconnectArgs(Objects.requireNonNull(defaults));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder preconnectlists(@Nullable Output<List<String>> preconnectlists) {
            $.preconnectlists = preconnectlists;
            return this;
        }

        public Builder preconnectlists(List<String> preconnectlists) {
            return preconnectlists(Output.of(preconnectlists));
        }

        public Builder preconnectlists(String... preconnectlists) {
            return preconnectlists(List.of(preconnectlists));
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

        public GetPropertyRulesBuilderRulesV20230530BehaviorPreconnectArgs build() {
            return $;
        }
    }

}