// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginalCpCodeLimits;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal();

    @Import(name="cpCodeLimits")
    private @Nullable GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginalCpCodeLimits cpCodeLimits;

    public Optional<GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginalCpCodeLimits> cpCodeLimits() {
        return Optional.ofNullable(this.cpCodeLimits);
    }

    @Import(name="createdDate")
    private @Nullable Integer createdDate;

    public Optional<Integer> createdDate() {
        return Optional.ofNullable(this.createdDate);
    }

    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="id")
    private @Nullable Integer id;

    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="products")
    private @Nullable List<String> products;

    public Optional<List<String>> products() {
        return Optional.ofNullable(this.products);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal(GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal $) {
        this.cpCodeLimits = $.cpCodeLimits;
        this.createdDate = $.createdDate;
        this.description = $.description;
        this.id = $.id;
        this.name = $.name;
        this.products = $.products;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal(Objects.requireNonNull(defaults));
        }

        public Builder cpCodeLimits(@Nullable GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginalCpCodeLimits cpCodeLimits) {
            $.cpCodeLimits = cpCodeLimits;
            return this;
        }

        public Builder createdDate(@Nullable Integer createdDate) {
            $.createdDate = createdDate;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder id(@Nullable Integer id) {
            $.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder products(@Nullable List<String> products) {
            $.products = products;
            return this;
        }

        public Builder products(String... products) {
            return products(List.of(products));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorImageManagerVideoCpCodeOriginal build() {
            return $;
        }
    }

}