// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest Empty = new GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest();

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="matchOn")
    private @Nullable String matchOn;

    public Optional<String> matchOn() {
        return Optional.ofNullable(this.matchOn);
    }

    @Import(name="matchOperator")
    private @Nullable String matchOperator;

    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest() {}

    private GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest(GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest $) {
        this.locked = $.locked;
        this.matchOn = $.matchOn;
        this.matchOperator = $.matchOperator;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest(Objects.requireNonNull(defaults));
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder matchOn(@Nullable String matchOn) {
            $.matchOn = matchOn;
            return this;
        }

        public Builder matchOperator(@Nullable String matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230105CriterionVisitorPrioritizationRequest build() {
            return $;
        }
    }

}
