// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateIssuerRdnsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateIssuerRdnsArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateIssuerRdnsArgs();

    @Import(name="c")
    private @Nullable Output<String> c;

    public Optional<Output<String>> c() {
        return Optional.ofNullable(this.c);
    }

    @Import(name="cn")
    private @Nullable Output<String> cn;

    public Optional<Output<String>> cn() {
        return Optional.ofNullable(this.cn);
    }

    @Import(name="o")
    private @Nullable Output<String> o;

    public Optional<Output<String>> o() {
        return Optional.ofNullable(this.o);
    }

    @Import(name="ou")
    private @Nullable Output<String> ou;

    public Optional<Output<String>> ou() {
        return Optional.ofNullable(this.ou);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateIssuerRdnsArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateIssuerRdnsArgs(GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateIssuerRdnsArgs $) {
        this.c = $.c;
        this.cn = $.cn;
        this.o = $.o;
        this.ou = $.ou;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateIssuerRdnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateIssuerRdnsArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateIssuerRdnsArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateIssuerRdnsArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateIssuerRdnsArgs(Objects.requireNonNull(defaults));
        }

        public Builder c(@Nullable Output<String> c) {
            $.c = c;
            return this;
        }

        public Builder c(String c) {
            return c(Output.of(c));
        }

        public Builder cn(@Nullable Output<String> cn) {
            $.cn = cn;
            return this;
        }

        public Builder cn(String cn) {
            return cn(Output.of(cn));
        }

        public Builder o(@Nullable Output<String> o) {
            $.o = o;
            return this;
        }

        public Builder o(String o) {
            return o(Output.of(o));
        }

        public Builder ou(@Nullable Output<String> ou) {
            $.ou = ou;
            return this;
        }

        public Builder ou(String ou) {
            return ou(Output.of(ou));
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorOriginCustomCertificateIssuerRdnsArgs build() {
            return $;
        }
    }

}