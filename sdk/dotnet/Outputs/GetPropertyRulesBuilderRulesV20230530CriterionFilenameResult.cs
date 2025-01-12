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
    public sealed class GetPropertyRulesBuilderRulesV20230530CriterionFilenameResult
    {
        public readonly bool? Locked;
        public readonly bool? MatchCaseSensitive;
        public readonly string? MatchOperator;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230530CriterionFilenameResult(
            bool? locked,

            bool? matchCaseSensitive,

            string? matchOperator,

            string? templateUuid,

            string? uuid,

            ImmutableArray<string> values)
        {
            Locked = locked;
            MatchCaseSensitive = matchCaseSensitive;
            MatchOperator = matchOperator;
            TemplateUuid = templateUuid;
            Uuid = uuid;
            Values = values;
        }
    }
}
