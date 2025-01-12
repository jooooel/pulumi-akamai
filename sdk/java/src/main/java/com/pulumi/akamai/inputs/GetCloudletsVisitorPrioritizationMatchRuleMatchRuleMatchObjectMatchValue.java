// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValue extends com.pulumi.resources.InvokeArgs {

    public static final GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValue Empty = new GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValue();

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="nameCaseSensitive")
    private @Nullable Boolean nameCaseSensitive;

    public Optional<Boolean> nameCaseSensitive() {
        return Optional.ofNullable(this.nameCaseSensitive);
    }

    @Import(name="nameHasWildcard")
    private @Nullable Boolean nameHasWildcard;

    public Optional<Boolean> nameHasWildcard() {
        return Optional.ofNullable(this.nameHasWildcard);
    }

    @Import(name="options")
    private @Nullable GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions options;

    public Optional<GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions> options() {
        return Optional.ofNullable(this.options);
    }

    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    @Import(name="values")
    private @Nullable List<String> values;

    public Optional<List<String>> values() {
        return Optional.ofNullable(this.values);
    }

    private GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValue() {}

    private GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValue(GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValue $) {
        this.name = $.name;
        this.nameCaseSensitive = $.nameCaseSensitive;
        this.nameHasWildcard = $.nameHasWildcard;
        this.options = $.options;
        this.type = $.type;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValue $;

        public Builder() {
            $ = new GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValue();
        }

        public Builder(GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValue defaults) {
            $ = new GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValue(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder nameCaseSensitive(@Nullable Boolean nameCaseSensitive) {
            $.nameCaseSensitive = nameCaseSensitive;
            return this;
        }

        public Builder nameHasWildcard(@Nullable Boolean nameHasWildcard) {
            $.nameHasWildcard = nameHasWildcard;
            return this;
        }

        public Builder options(@Nullable GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValueOptions options) {
            $.options = options;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetCloudletsVisitorPrioritizationMatchRuleMatchRuleMatchObjectMatchValue build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
