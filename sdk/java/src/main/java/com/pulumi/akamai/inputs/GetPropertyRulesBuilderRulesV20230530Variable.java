// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetPropertyRulesBuilderRulesV20230530Variable extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530Variable Empty = new GetPropertyRulesBuilderRulesV20230530Variable();

    @Import(name="description", required=true)
    private String description;

    public String description() {
        return this.description;
    }

    @Import(name="hidden", required=true)
    private Boolean hidden;

    public Boolean hidden() {
        return this.hidden;
    }

    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    @Import(name="sensitive", required=true)
    private Boolean sensitive;

    public Boolean sensitive() {
        return this.sensitive;
    }

    @Import(name="value", required=true)
    private String value;

    public String value() {
        return this.value;
    }

    private GetPropertyRulesBuilderRulesV20230530Variable() {}

    private GetPropertyRulesBuilderRulesV20230530Variable(GetPropertyRulesBuilderRulesV20230530Variable $) {
        this.description = $.description;
        this.hidden = $.hidden;
        this.name = $.name;
        this.sensitive = $.sensitive;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530Variable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530Variable $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530Variable();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530Variable defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530Variable(Objects.requireNonNull(defaults));
        }

        public Builder description(String description) {
            $.description = description;
            return this;
        }

        public Builder hidden(Boolean hidden) {
            $.hidden = hidden;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder sensitive(Boolean sensitive) {
            $.sensitive = sensitive;
            return this;
        }

        public Builder value(String value) {
            $.value = value;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530Variable build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.hidden = Objects.requireNonNull($.hidden, "expected parameter 'hidden' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.sensitive = Objects.requireNonNull($.sensitive, "expected parameter 'sensitive' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
