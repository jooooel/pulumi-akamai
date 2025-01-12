// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorEcmsDatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorEcmsDatabaseArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorEcmsDatabaseArgs();

    @Import(name="database")
    private @Nullable Output<String> database;

    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    @Import(name="extractLocation")
    private @Nullable Output<String> extractLocation;

    public Optional<Output<String>> extractLocation() {
        return Optional.ofNullable(this.extractLocation);
    }

    @Import(name="headerName")
    private @Nullable Output<String> headerName;

    public Optional<Output<String>> headerName() {
        return Optional.ofNullable(this.headerName);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="queryParameterName")
    private @Nullable Output<String> queryParameterName;

    public Optional<Output<String>> queryParameterName() {
        return Optional.ofNullable(this.queryParameterName);
    }

    @Import(name="regexPattern")
    private @Nullable Output<String> regexPattern;

    public Optional<Output<String>> regexPattern() {
        return Optional.ofNullable(this.regexPattern);
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

    private GetPropertyRulesBuilderRulesV20230105BehaviorEcmsDatabaseArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorEcmsDatabaseArgs(GetPropertyRulesBuilderRulesV20230105BehaviorEcmsDatabaseArgs $) {
        this.database = $.database;
        this.extractLocation = $.extractLocation;
        this.headerName = $.headerName;
        this.locked = $.locked;
        this.queryParameterName = $.queryParameterName;
        this.regexPattern = $.regexPattern;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorEcmsDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorEcmsDatabaseArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorEcmsDatabaseArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorEcmsDatabaseArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorEcmsDatabaseArgs(Objects.requireNonNull(defaults));
        }

        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        public Builder database(String database) {
            return database(Output.of(database));
        }

        public Builder extractLocation(@Nullable Output<String> extractLocation) {
            $.extractLocation = extractLocation;
            return this;
        }

        public Builder extractLocation(String extractLocation) {
            return extractLocation(Output.of(extractLocation));
        }

        public Builder headerName(@Nullable Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder queryParameterName(@Nullable Output<String> queryParameterName) {
            $.queryParameterName = queryParameterName;
            return this;
        }

        public Builder queryParameterName(String queryParameterName) {
            return queryParameterName(Output.of(queryParameterName));
        }

        public Builder regexPattern(@Nullable Output<String> regexPattern) {
            $.regexPattern = regexPattern;
            return this;
        }

        public Builder regexPattern(String regexPattern) {
            return regexPattern(Output.of(regexPattern));
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

        public GetPropertyRulesBuilderRulesV20230105BehaviorEcmsDatabaseArgs build() {
            return $;
        }
    }

}
