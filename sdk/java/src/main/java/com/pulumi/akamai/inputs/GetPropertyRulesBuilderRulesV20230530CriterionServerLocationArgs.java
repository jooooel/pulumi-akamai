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


public final class GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs Empty = new GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs();

    @Import(name="continents")
    private @Nullable Output<List<String>> continents;

    public Optional<Output<List<String>>> continents() {
        return Optional.ofNullable(this.continents);
    }

    @Import(name="countries")
    private @Nullable Output<List<String>> countries;

    public Optional<Output<List<String>>> countries() {
        return Optional.ofNullable(this.countries);
    }

    @Import(name="locationType")
    private @Nullable Output<String> locationType;

    public Optional<Output<String>> locationType() {
        return Optional.ofNullable(this.locationType);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="matchOperator")
    private @Nullable Output<String> matchOperator;

    public Optional<Output<String>> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }

    @Import(name="regions")
    private @Nullable Output<List<String>> regions;

    public Optional<Output<List<String>>> regions() {
        return Optional.ofNullable(this.regions);
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

    private GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs() {}

    private GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs(GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs $) {
        this.continents = $.continents;
        this.countries = $.countries;
        this.locationType = $.locationType;
        this.locked = $.locked;
        this.matchOperator = $.matchOperator;
        this.regions = $.regions;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder continents(@Nullable Output<List<String>> continents) {
            $.continents = continents;
            return this;
        }

        public Builder continents(List<String> continents) {
            return continents(Output.of(continents));
        }

        public Builder continents(String... continents) {
            return continents(List.of(continents));
        }

        public Builder countries(@Nullable Output<List<String>> countries) {
            $.countries = countries;
            return this;
        }

        public Builder countries(List<String> countries) {
            return countries(Output.of(countries));
        }

        public Builder countries(String... countries) {
            return countries(List.of(countries));
        }

        public Builder locationType(@Nullable Output<String> locationType) {
            $.locationType = locationType;
            return this;
        }

        public Builder locationType(String locationType) {
            return locationType(Output.of(locationType));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder matchOperator(@Nullable Output<String> matchOperator) {
            $.matchOperator = matchOperator;
            return this;
        }

        public Builder matchOperator(String matchOperator) {
            return matchOperator(Output.of(matchOperator));
        }

        public Builder regions(@Nullable Output<List<String>> regions) {
            $.regions = regions;
            return this;
        }

        public Builder regions(List<String> regions) {
            return regions(Output.of(regions));
        }

        public Builder regions(String... regions) {
            return regions(List.of(regions));
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

        public GetPropertyRulesBuilderRulesV20230530CriterionServerLocationArgs build() {
            return $;
        }
    }

}
