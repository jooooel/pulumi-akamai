// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppSecExportConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecExportConfigurationArgs Empty = new GetAppSecExportConfigurationArgs();

    /**
     * . Unique identifier of the security configuration you want to return information for.
     * 
     */
    @Import(name="configId", required=true)
    private Output<Integer> configId;

    /**
     * @return . Unique identifier of the security configuration you want to return information for.
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }

    /**
     * . JSON array of strings specifying the types of information to be retrieved. Note that there are two different ways to return data by using the `search` parameter. To return data in tabular format, use one or more of the following terms:
     * 
     */
    @Import(name="searches")
    private @Nullable Output<List<String>> searches;

    /**
     * @return . JSON array of strings specifying the types of information to be retrieved. Note that there are two different ways to return data by using the `search` parameter. To return data in tabular format, use one or more of the following terms:
     * 
     */
    public Optional<Output<List<String>>> searches() {
        return Optional.ofNullable(this.searches);
    }

    /**
     * . Version number of the security configuration.
     * 
     */
    @Import(name="version", required=true)
    private Output<Integer> version;

    /**
     * @return . Version number of the security configuration.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    private GetAppSecExportConfigurationArgs() {}

    private GetAppSecExportConfigurationArgs(GetAppSecExportConfigurationArgs $) {
        this.configId = $.configId;
        this.searches = $.searches;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecExportConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecExportConfigurationArgs $;

        public Builder() {
            $ = new GetAppSecExportConfigurationArgs();
        }

        public Builder(GetAppSecExportConfigurationArgs defaults) {
            $ = new GetAppSecExportConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId . Unique identifier of the security configuration you want to return information for.
         * 
         * @return builder
         * 
         */
        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId . Unique identifier of the security configuration you want to return information for.
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param searches . JSON array of strings specifying the types of information to be retrieved. Note that there are two different ways to return data by using the `search` parameter. To return data in tabular format, use one or more of the following terms:
         * 
         * @return builder
         * 
         */
        public Builder searches(@Nullable Output<List<String>> searches) {
            $.searches = searches;
            return this;
        }

        /**
         * @param searches . JSON array of strings specifying the types of information to be retrieved. Note that there are two different ways to return data by using the `search` parameter. To return data in tabular format, use one or more of the following terms:
         * 
         * @return builder
         * 
         */
        public Builder searches(List<String> searches) {
            return searches(Output.of(searches));
        }

        /**
         * @param searches . JSON array of strings specifying the types of information to be retrieved. Note that there are two different ways to return data by using the `search` parameter. To return data in tabular format, use one or more of the following terms:
         * 
         * @return builder
         * 
         */
        public Builder searches(String... searches) {
            return searches(List.of(searches));
        }

        /**
         * @param version . Version number of the security configuration.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version . Version number of the security configuration.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public GetAppSecExportConfigurationArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}