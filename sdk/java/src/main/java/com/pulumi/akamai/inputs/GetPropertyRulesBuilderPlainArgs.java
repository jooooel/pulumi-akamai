// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderPlainArgs Empty = new GetPropertyRulesBuilderPlainArgs();

    @Import(name="rulesV20230105")
    private @Nullable GetPropertyRulesBuilderRulesV20230105 rulesV20230105;

    public Optional<GetPropertyRulesBuilderRulesV20230105> rulesV20230105() {
        return Optional.ofNullable(this.rulesV20230105);
    }

    private GetPropertyRulesBuilderPlainArgs() {}

    private GetPropertyRulesBuilderPlainArgs(GetPropertyRulesBuilderPlainArgs $) {
        this.rulesV20230105 = $.rulesV20230105;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderPlainArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderPlainArgs();
        }

        public Builder(GetPropertyRulesBuilderPlainArgs defaults) {
            $ = new GetPropertyRulesBuilderPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder rulesV20230105(@Nullable GetPropertyRulesBuilderRulesV20230105 rulesV20230105) {
            $.rulesV20230105 = rulesV20230105;
            return this;
        }

        public GetPropertyRulesBuilderPlainArgs build() {
            return $;
        }
    }

}