// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorEcmsDatabaseResult
    {
        public readonly string? Database;
        public readonly string? ExtractLocation;
        public readonly string? HeaderName;
        public readonly bool? Locked;
        public readonly string? QueryParameterName;
        public readonly string? RegexPattern;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530BehaviorEcmsDatabaseResult(
            string? database,

            string? extractLocation,

            string? headerName,

            bool? locked,

            string? queryParameterName,

            string? regexPattern,

            string? templateUuid,

            string? uuid)
        {
            Database = database;
            ExtractLocation = extractLocation;
            HeaderName = headerName;
            Locked = locked;
            QueryParameterName = queryParameterName;
            RegexPattern = regexPattern;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}