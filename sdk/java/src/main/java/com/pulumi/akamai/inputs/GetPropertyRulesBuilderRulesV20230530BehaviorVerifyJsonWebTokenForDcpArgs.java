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


public final class GetPropertyRulesBuilderRulesV20230530BehaviorVerifyJsonWebTokenForDcpArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorVerifyJsonWebTokenForDcpArgs Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorVerifyJsonWebTokenForDcpArgs();

    @Import(name="authorizations")
    private @Nullable Output<String> authorizations;

    public Optional<Output<String>> authorizations() {
        return Optional.ofNullable(this.authorizations);
    }

    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    @Import(name="customHeader")
    private @Nullable Output<Boolean> customHeader;

    public Optional<Output<Boolean>> customHeader() {
        return Optional.ofNullable(this.customHeader);
    }

    @Import(name="enableEs256")
    private @Nullable Output<Boolean> enableEs256;

    public Optional<Output<Boolean>> enableEs256() {
        return Optional.ofNullable(this.enableEs256);
    }

    @Import(name="enableRs256")
    private @Nullable Output<Boolean> enableRs256;

    public Optional<Output<Boolean>> enableRs256() {
        return Optional.ofNullable(this.enableRs256);
    }

    @Import(name="extractAuthorizations")
    private @Nullable Output<Boolean> extractAuthorizations;

    public Optional<Output<Boolean>> extractAuthorizations() {
        return Optional.ofNullable(this.extractAuthorizations);
    }

    @Import(name="extractClientId")
    private @Nullable Output<Boolean> extractClientId;

    public Optional<Output<Boolean>> extractClientId() {
        return Optional.ofNullable(this.extractClientId);
    }

    @Import(name="extractLocation")
    private @Nullable Output<String> extractLocation;

    public Optional<Output<String>> extractLocation() {
        return Optional.ofNullable(this.extractLocation);
    }

    @Import(name="extractUserName")
    private @Nullable Output<Boolean> extractUserName;

    public Optional<Output<Boolean>> extractUserName() {
        return Optional.ofNullable(this.extractUserName);
    }

    @Import(name="headerName")
    private @Nullable Output<String> headerName;

    public Optional<Output<String>> headerName() {
        return Optional.ofNullable(this.headerName);
    }

    @Import(name="jwt")
    private @Nullable Output<String> jwt;

    public Optional<Output<String>> jwt() {
        return Optional.ofNullable(this.jwt);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="primaryLocation")
    private @Nullable Output<String> primaryLocation;

    public Optional<Output<String>> primaryLocation() {
        return Optional.ofNullable(this.primaryLocation);
    }

    @Import(name="queryParameterName")
    private @Nullable Output<String> queryParameterName;

    public Optional<Output<String>> queryParameterName() {
        return Optional.ofNullable(this.queryParameterName);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="userName")
    private @Nullable Output<String> userName;

    public Optional<Output<String>> userName() {
        return Optional.ofNullable(this.userName);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorVerifyJsonWebTokenForDcpArgs() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorVerifyJsonWebTokenForDcpArgs(GetPropertyRulesBuilderRulesV20230530BehaviorVerifyJsonWebTokenForDcpArgs $) {
        this.authorizations = $.authorizations;
        this.clientId = $.clientId;
        this.customHeader = $.customHeader;
        this.enableEs256 = $.enableEs256;
        this.enableRs256 = $.enableRs256;
        this.extractAuthorizations = $.extractAuthorizations;
        this.extractClientId = $.extractClientId;
        this.extractLocation = $.extractLocation;
        this.extractUserName = $.extractUserName;
        this.headerName = $.headerName;
        this.jwt = $.jwt;
        this.locked = $.locked;
        this.primaryLocation = $.primaryLocation;
        this.queryParameterName = $.queryParameterName;
        this.templateUuid = $.templateUuid;
        this.userName = $.userName;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorVerifyJsonWebTokenForDcpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorVerifyJsonWebTokenForDcpArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorVerifyJsonWebTokenForDcpArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorVerifyJsonWebTokenForDcpArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorVerifyJsonWebTokenForDcpArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizations(@Nullable Output<String> authorizations) {
            $.authorizations = authorizations;
            return this;
        }

        public Builder authorizations(String authorizations) {
            return authorizations(Output.of(authorizations));
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder customHeader(@Nullable Output<Boolean> customHeader) {
            $.customHeader = customHeader;
            return this;
        }

        public Builder customHeader(Boolean customHeader) {
            return customHeader(Output.of(customHeader));
        }

        public Builder enableEs256(@Nullable Output<Boolean> enableEs256) {
            $.enableEs256 = enableEs256;
            return this;
        }

        public Builder enableEs256(Boolean enableEs256) {
            return enableEs256(Output.of(enableEs256));
        }

        public Builder enableRs256(@Nullable Output<Boolean> enableRs256) {
            $.enableRs256 = enableRs256;
            return this;
        }

        public Builder enableRs256(Boolean enableRs256) {
            return enableRs256(Output.of(enableRs256));
        }

        public Builder extractAuthorizations(@Nullable Output<Boolean> extractAuthorizations) {
            $.extractAuthorizations = extractAuthorizations;
            return this;
        }

        public Builder extractAuthorizations(Boolean extractAuthorizations) {
            return extractAuthorizations(Output.of(extractAuthorizations));
        }

        public Builder extractClientId(@Nullable Output<Boolean> extractClientId) {
            $.extractClientId = extractClientId;
            return this;
        }

        public Builder extractClientId(Boolean extractClientId) {
            return extractClientId(Output.of(extractClientId));
        }

        public Builder extractLocation(@Nullable Output<String> extractLocation) {
            $.extractLocation = extractLocation;
            return this;
        }

        public Builder extractLocation(String extractLocation) {
            return extractLocation(Output.of(extractLocation));
        }

        public Builder extractUserName(@Nullable Output<Boolean> extractUserName) {
            $.extractUserName = extractUserName;
            return this;
        }

        public Builder extractUserName(Boolean extractUserName) {
            return extractUserName(Output.of(extractUserName));
        }

        public Builder headerName(@Nullable Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        public Builder jwt(@Nullable Output<String> jwt) {
            $.jwt = jwt;
            return this;
        }

        public Builder jwt(String jwt) {
            return jwt(Output.of(jwt));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder primaryLocation(@Nullable Output<String> primaryLocation) {
            $.primaryLocation = primaryLocation;
            return this;
        }

        public Builder primaryLocation(String primaryLocation) {
            return primaryLocation(Output.of(primaryLocation));
        }

        public Builder queryParameterName(@Nullable Output<String> queryParameterName) {
            $.queryParameterName = queryParameterName;
            return this;
        }

        public Builder queryParameterName(String queryParameterName) {
            return queryParameterName(Output.of(queryParameterName));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder userName(@Nullable Output<String> userName) {
            $.userName = userName;
            return this;
        }

        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorVerifyJsonWebTokenForDcpArgs build() {
            return $;
        }
    }

}