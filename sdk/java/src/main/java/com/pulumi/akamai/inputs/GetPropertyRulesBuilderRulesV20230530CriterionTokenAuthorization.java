// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization Empty = new GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization();

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="matchOperator")
    private @Nullable String matchOperator;

    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    @Import(name="statusLists")
    private @Nullable List<String> statusLists;

    public Optional<List<String>> statusLists() {
        return Optional.ofNullable(this.statusLists);
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

    private GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization() {}

    private GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization(GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization $) {
        this.locked = $.locked;
        this.matchOperator = $.matchOperator;
        this.statusLists = $.statusLists;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization(Objects.requireNonNull(defaults));
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder matchOperator(@Nullable String matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        public Builder statusLists(@Nullable List<String> statusLists) {
            $.statusLists = statusLists;
            return this;
        }

        public Builder statusLists(String... statusLists) {
            return statusLists(List.of(statusLists));
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530CriterionTokenAuthorization build() {
            return $;
        }
    }

}