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
    public sealed class GetPropertyRulesBuilderRulesV20230105CriterionMatchAdvancedResult
    {
        public readonly string? CloseXml;
        public readonly string? Description;
        public readonly bool? Locked;
        public readonly string? OpenXml;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230105CriterionMatchAdvancedResult(
            string? closeXml,

            string? description,

            bool? locked,

            string? openXml,

            string? templateUuid,

            string? uuid)
        {
            CloseXml = closeXml;
            Description = description;
            Locked = locked;
            OpenXml = openXml;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
